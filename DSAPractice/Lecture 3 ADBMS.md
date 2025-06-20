if there are 3 columns in the table then you will need 3 variables in the cursor
cursor is used to do one by one
% acts like a dot(.)
fetch

```SQL
--  This sends a whole table to the screen.
--  A few boolean cursor attributes are automatically maintained by
--  the system. 

declare

   delilah number;
   martin number;
   acube number;

   cursor eric  is select * from x;

begin
	open eric;
		loop   -- This is an endless loop
			fetch eric into delilah, martin, acube;
			if eric%found -- boolean attribute of the cursor 
	                    -- set automatically by the system.
	    -- If there was a line it is
	    -- set to true (1)
			then
				dbms_output.put_line(' ' || delilah || ' --- ' || 
	                              martin || ' --- ' ||  acube);
			else 
				exit;  -- This jumps out of the loop
			end if;
		end loop;
	close eric;
end;

```
selection join and projection are the three operations of relational algebra

# Lecture 4 ADBMS

digital twin:h

# Lecture 8 
## Lec 8 F13: PL_SQL Part8 XML in Oracle

``` 
select a.card.extract('/acard').getstringval()
from addr_book a;
```

since there is no where clause there will be all returned
 if we want only root starting from /acard

# Lecture 10

we make a graph as the native data structure
xml is the native data structure -> not tables
#excalidraw

  
 Neo4j is a graph database -> each node is called a table

 red team finds errors in your program