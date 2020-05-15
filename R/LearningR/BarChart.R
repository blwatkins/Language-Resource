# Learning R
# Bar Chart

# Install and Load Packages ####
if (!require("pacman")) install.packages("pacman")
pacman::p_load(pacman, tidyverse)

# Data ####
# diamonds dataset from ggplot2
diamonds

# Plot the Data ####
plot(diamonds$cut)

# Using Pipes ####
diamonds %>% 
  select(color) %>% # plot the color variable
  plot()

# Using the table Method ####
diamonds %>%
  select(clarity) %>%
  table() %>%
  barplot()

## Sort bars
diamonds %>%
  select(clarity) %>%
  table() %>%
  sort(decreasing = T) %>%
  barplot()

# Add Information to Plot ####
diamonds %>%
  select(clarity) %>%
  table() %>%
  sort(decreasing = T) %>%
  barplot(
    main="Diamond Clarity", # graph title
    sub="Source: ggplot2::diamonds", # graph subtitile
    horiz=T, # draw a horizontal plot
    ylab="Clarity of Diamonds", # y-axis label
    xlab="Number of Diamonds", # x-axis label
    xlim=c(0, 15000), # x-axis scale
    border=NA, # no border
    col="red3"
  )
  
# Stacked Bar Chart ####
# step 1 - create a data frame
df <- diamonds %>%
  select(color, clarity) %>%
  table()
df

# step 2 - create chart
df %>%
  barplot()

# create chart with legend
df %>%
  barplot(
    legend=rownames(.) # . is a placeholder for the pipe
  )

# Side by Side Bar Chart ####
df %>%
  barplot(
    legend=rownames(.), # . is a placeholder for the pipe
    beside=T,
    col=rainbow(7)
  )

# Clean Up
rm(list=ls())
dev.off()
p_unload(all)
