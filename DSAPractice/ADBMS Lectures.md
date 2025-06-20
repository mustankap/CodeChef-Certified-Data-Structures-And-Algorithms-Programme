```sql
create table addr_book(
    name  varchar2(20),
    card  sys.xmltype,
    creationDate  Date
)

insert into addr_book values (
   'James', 
    sys.XMLType.createXML(       -- This is a kind of CONSTRUCTOR
    '<acard createdby="Jim">
         <email>geller@njit.edu</email>
         <wphone>596-3383</wphone>
         <wphone>596-3366</wphone>
         <cell>794-4399</cell>
     </acard>'), 
    sysdate)

```
__The constructor takes the string that contains XML code and stores it as an XML-object. (Not the objects we had before.)__

- If you want a string, you have to now append the method
`.getstringval()`

- If you want a number, you use  
`.getnumberval()`

```sql
select Name, a.card.extract('/').getstringval()
from  addr_book a
```

- In the middle column I can put anything.  Not just `<acard>`

```sql
insert into addr_book values ('Joe', 
sys.XMLType.createXML('<test>here</test>'),
sysdate)

select     a.card.extract('/acard').getstringval()
from addr_book a;

select Name, a.card.extract('/test').getstringval()
from addr_book a
```

`existsNode()`. 
- It does NOT return the the XML structure, only the truth value.
- `text()` will return without xml tag
```sql
select Name, a.card.extract('/test').getstringval()
from addr_book a
where a.card.existsNode('/test') = 1

select Name, a.card.extract('/acard/email/text()').getstringval()
from addr_book a
where a.card.existsNode('/acard') = 1```

if there are xml where  there 2 phone numbers:
```sql
select Name, a.card.extract('/acard/wphone[1]/text()').getstringval(),
a.card.extract('/acard/wphone[3]/text()').getstringval(),
a.card.extract('/acard/wphone[2]/text()')
from addr_book a
where name='James' or name**

'<acard    createdby   =   "Jim"    >

         <email>geller@njit.edu</email>

         <wphone>596-3383</wphone>

         <wphone>596-3366</wphone>

         <cell>794-4399</cell>

     </acard>'

  
  

select a.card.extract('/acard/@createdby').getstringval() 

from addr_book a where name = 'James'

**='Roger'  


```

## cypher code

To do the equivalent of a SELECT * FROM CAT for Nodes Only you need to write:

<mark style="background: #BBFABBA6;">MATCH (thing) RETURN thing</mark>

In the above, "thing" is a variable. 
Line comments start with 
//
There is a convention to have all variables as words with small initial letters, but it works anyway. The following all work. 
MATCH (Thing) RETURN Thing
MATCH (THING) RETURN THING
match (THING) return THING
match (THING) Return THING

 *However, this does NOT work.*
*MATCH (Thing) RETURN thing   // case does not match*

So these are the conventions:
- Reserved words of Cypher are all capital by convention.
- Relationships are all capital with underscores. They start with : 
- Node labels have the first letter initialized.
- Variables consist of small letters.

HINT: When you are debugging within one frame you can use an UP-ARROW to go back to the previous Cypher Command.

<mark style="background: #FFB86CA6;"> 
CREATE (p:Person {firstname: 'Ashish', age:30}) RETURN p
</mark>

#### **If you create TWO instances of the same class (:Person) with the same single property {name: 'Ashish'} the system will assign them two different ID values, but other than that the system will NOT stop you from doing this.**


Relationships can be written   --> and also  <--  

-[  ]->

<-[  ]-

Between the [] brackets comes the name of the relationship.  There are also undirected relationships written with two minus

-[]-       

But apparently you cannot use undirected relationships to CREATE a Relationship. You can only use it to query.

```cypher

//Triple creation (they call it a pattern, but I prefer triple).

CREATE   (p:Person {name: 'Angelika'})   -[:LIKES]->    (t:Technology {name: 'Databases'}) RETURN p, t

  

//The above basically says that Angelika likes Databases.

MATCH (p:Person) -[:LIKES]- (t:Technology)    RETURN p, t

//will find the above and display as a diagram.

```

 **Relationships have their own ID numbers.**

```cypher
MATCH (p:Person)    -[test]->    (t:Technology)    RETURN test
```

```json
{
"identity":1,
"start":16,
"end":17,
"type": "LIKES",
"properties":{

	}
}
```
---
```json
{
"identity":2,
"start":27,
"end":28,
"type": "LIKES",
"properties":{

	}
}
```
Because test is without a : it is a variable.
-[test]->

```cypher
CREATE (p:Person    {name: 'Joe Smith'})
CREATE (p:Person    {name: 'Amanda Lear',   age: 50})
//node properties

MATCH (p:Person {name: 'Amanda Lear'})    RETURN p.name, p.age
//relationship properties
MATCH   ()   -[r:STUDIED_AT]-   ()     WHERE   id(r) = 1    SET   r.years = 4 

RETURN DISTINCT r

```

You can use an alias AS exactly the same way you do it in SQL.

MATCH … RETURN   movie.title   AS `Movie Title`
```cypher
MATCH (p:Person)-[r:IS_FRIENDS_WITH]-(q:Person) 
WHERE r.years=3 
RETURN p, q

//update

MATCH (p:PERSON {name: 'Jennifer'})
SET p.age = 41
RETURN p


//relationship updation of properties
MATCH    (p:Person {name: 'Vincent Ward'})    -[rel:ACTED_IN]->    (m:Movie {name: 'A Few Good Man'}) 
SET rel.releasedate = 1989 RETURN rel

//Did it work?
//Let's look for it. 
 
MATCH (p:Person {name: 'Vincent Ward'})    -[rel:ACTED_IN]->    (m:Movie {name: 'A Few Good Men'})     RETURN rel

```
Delete :-
```cypher
MATCH (j:Person {name: 'Jennifer'})    -[r:IS_FRIEND_WITH]->    (m:Person {name: 'Mark'})
DELETE r

//DELETE a node:
//You can only delete a disconnected node. (A node with no relationships at all.)

MATCH (m:PERSON {name: 'Mark'})
DELETE m


MATCH (m:PERSON {name: 'Mark'})
DETACH DELETE m
			  
```

Then we can removeage this way also.
```cypher
MATCH (n:Person {name:'Jennifer'})
SET n.age = null

//MERGE a node
//Let's start with a simple case.  Assume the database is empty.
MERGE (m:Person {name: 'Mark'})  RETURN m
MERGE (j:Person {name: 'Jennifer'}) RETURN j

MERGE (m:Person {name: 'Mark'}) RETURN m
//Because Mark exists now, the node is returned. It is NOT created as a second Mark. 

match (p)  where id(p)=5   
with p   
match(p2)   where id(p2)=4   
with p, p2    
merge (p)-[:IS_PARTNER_WITH]->(p2) return p, p2

```
The "with p, p2" keeps both values "alive" for the merge statement.

```cypher
MERGE (m:Person {name: 'Mark'}) -[r:IS_PARTNER_WITH]-> (j:Person {name: 'Jennifer'})
  ON CREATE SET r.since = date('2018-03-01')       // if r does not exist, assign it a date
  ON MATCH SET r.years = 3           //if r exists, assign years a value
```
If Mark exists, and Jennifer exists, and IS_FRIENDS_WITH does NOT exist and I run the above operations TWICE….

EXAMPLE:  In the Movie Database, find actors in any movies that Jessica Thompson reviewed.
Step 1:
Find Jessica Thompson.
Solution 1: With WHERE clause
```cypher
MATCH    (p:Person)    WHERE p.name ='Jessica Thompson'    RETURN p
```
Solution 2: Use the property  (PREFERRED solution)
```cypher
MATCH    (p:Person {name: 'Jessica Thompson'})    RETURN p
```
Step 2: Find movies that Jessica Thompson reviewed
NOTE:  If I don't remember the exact relationship that's fine, because Neo4j will pop up all existing relationships in a menu to choose from!

```cypher
MATCH (p:Person {name: 'Jessica Thompson'})   -[r:REVIEWED]->   (m:Movie)  RETURN p, m
```
Step 3:
Now we want all the actors in those movies.
```cypher
MATCH (p:Person {name: 'Jessica Thompson'})   -[REVIEWED]-> (m:Movie)  <-[:ACTED_IN]-   (p2:Person)  RETURN p, m, p2
```

Now how can I make sure that I get no actor twice?

```cypher
MATCH (p:Person {name: 'Jessica Thompson'}) -[REVIEWED]-> (m:Movie) <-[:ACTED_IN]-(p2:Person)  RETURN DISTINCT p, m, p2
```

If I want the actors only, …

```cypher
MATCH (p:Person {name: 'Jessica Thompson'}) -[REVIEWED]-> (m:Movie) <-[:ACTED_IN]-(p2:Person)  RETURN DISTINCT  p2
```
  , and | or text for table view
  
```cypher
MATCH (p:Person {name: 'Tom Hanks'}) -[r:ACTED_IN   |    DIRECTED]-> (m:Movie) return p, r, m
//aggregate
match (m:Movie) return count(m)
```
The vertical bar worked as OR operation for Relationships. 
Note that there is NO COLON in front of DIRECTED.

### **JSON in ORACLE SQL**

```sql
create table json_documents (
      mydata CLOB
      constraint c1 check (mydata is JSON)      

)

insert into json_documents values (

   '{
      "FirstName" : "John",
      "LastName"  : "Doe",
      "Address"   : {
                       "Street" : "99 Main Street",
                       "City"   : "Newark",
                       "State"  : "NJ"
                    },
      "Contact"   : {
                       "Email"  : "John.doe@gmail.com",
                       "Phone"  : "(973) 555-1212"
                    }
    }')


select a.mydata.Contact.Email from json_documents a;
-- wont work without alias a


```
**NOTE: NO constructor!**
There are two ways to access JSON data.
A simple one with object paths and a complicated one.

Here is the simple version:

```sql
select mydata from json_documents j
where j.mydata.FirstName  = 'John'
/

select mydata from json_documents
where json_value(mydata, '$.FirstName') = 'John'
/





select mydata from json_documents j
where j.mydata.Address.City  = 'Newark'
/
select mydata from json_documents 
where json_value(mydata, '$.Address.City') = 'Newark'

select j.mydata.LastName  from json_documents j
where j.mydata.FirstName = 'John'
/

-- Complicated:

select json_value(mydata, '$.LastName')  from json_documents
where json_value(mydata, '$.FirstName') = 'John'
/

select json_value(mydata, '$.FirstName'),json_value(mydata, '$.LastName') 
from json_documents
where json_value(mydata, '$.FirstName') = 'John'
/
 
select json_value(mydata, '$.FirstName') as FN,json_value(mydata, '$.LastName') as LN
from json_documents
where json_value(mydata, '$.FirstName') = 'John'
/

select json_value(mydata, '$.FirstName') as FN,json_value(mydata, '$.LastName') as LN, 
json_value(mydata, '$.Address.City') as CITY from json_documents
where json_value(mydata, '$.FirstName') = 'John'
/
```
**SQL Update is NOT allowed for JSON data.**
## Mongo DB
```mongodb
db.cafes.insertMany(
[  {"Name" : "Dream Cafe"},
   {"Name" : "My Favorite Cafe"},
   {"Name" : "Cafe Europe"},
   {"Name" : "French Flavor"}  ]  )

db.cafes.remove({"Name" : "Cafe Europe"})
db.cafes.updateOne(  {"Name" : "French Flavor"}   ,    {$set: {"Name" : "British Flavor"}})


db.cafes.update({"Name" : "Dream Cafe"}    ,    {$set: {"Style" : "Bistro"}})

//Even though that should work, it is recommended to use updateOne.


db.cafes.insert({"Name" : "Morning Glory", 

                         "Drinks" : ["Cappuccino", "Espresso", "Mocha"]})


db.cafes.find(    {"Name" : "Morning Glory"}   ,   {"Drinks" : 1})

The "1" means TRUE.  Return this


Note that the _id is returned even though I did not ask for it.

I can suppress the _id:

db.cafes.find({"Name" : "Morning Glory"}    ,    {"Drinks" : 1, "_id" : 0})


Now we remove the first drink from the list.

db.cafes.update({"Name" : "Morning Glory"}, 

{$pop : {"Drinks" : -1 }}

Remove a specific drink from a list:

db.cafes.update({"Name" : "Morning Glory"}, 
{$pull: {"Drinks" : {$in: ["Espresso"] }}})

Now we remove the first drink from the list.
db.cafes.update({"Name" : "Morning Glory"}, 
{$pop : {"Drinks" : -1 }})



db.collection.update({},
{  
   $push:{  
      "arr":{  
         $each:[  
            {  
               "number": 3,
               "someValue": "S"
            }
         ],
         $position: 0
      }
   }
})
`

the `$position` specify where the element will be inserted.




Simplest aggregate.
How many documents are in the database?
db.cafes.find({}).count()


db.cafes.find().sort( {Rank : -1})
This command sorts in DESCENDING ORDER

db.cafes.find().sort( {Rank : 1})
This command sorts in ASCENDING ORDER

db.cafes.find({"Rank" : {$in: [1, 2, 3, 4]}})


db.cafes.find({"Rank" : {$exists : 1}})
or
db.cafes.find({"Rank" : {$exists : true}})
This will return the ranks as numbers and the ranks as strings.


But I want to sort only the Airports.
Here I use $and

db.cafes.find({$and: [
                                        {"Rank" : {$exists : true}},
                                        {"Airport" : {$exists : true}}
                                     ]
                          }).sort({"Rank" : 1})


update salary by 50
db.jimdb.update({Salary: 60.0}  ,  {$inc: {Salary: 50.00}})


```
---

```
db.jimdb.update({Income: 10.0}, {$set: {Bonus: 50}})



db.getCollection("TestCollectionOfUS").update({"AveragePrice" : {$exists : 1}},

                                     {$mul: {"AveragePrice" : 1.1}})

b.jimdb.update({Salary: 60.0}  ,  {$inc: {Salary: 50.00}})



db.jimdb.aggregate([{$group: {_id: 23, incomeset: {$push: "$Income"}}}])
That worked!

Now we want the sum of the array of incomes:
 
db.jimdb.aggregate(  [ {$group: {_id: 23, incomeset: {$sum: "$Income"}}}  ] )
{
    "_id" : 23.0,
    "incomeset" : 210.0
}


Here is a different way to sort by Income:
db.jimdb.aggregate([ {$sort: {Income : 1}}] )


```
T
