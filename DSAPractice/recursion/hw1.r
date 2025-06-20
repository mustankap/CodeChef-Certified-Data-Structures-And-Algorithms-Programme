
library(dplyr)

data(mtcars)


cyl_means <- mtcars %>%
  group_by(cyl) %>%
  summarize(mean_mpg = mean(mpg))


print(cyl_means)