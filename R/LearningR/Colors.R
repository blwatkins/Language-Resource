# Learning R
# Colors

x = c(1, 2, 3, 4, 5)
barplot(x)

# get list of color names
colors() 

# using color names
barplot(x, col="red3")

# using rgb 0-1
barplot(x, col=rgb(0.5, 0.1, 0.6))

# using rgb 0-255
barplot(x, col=rgb(150, 25, 200, max=255))

# multiple colors
barplot(x, col=c("red", "violet"))

# Color Paletes ####
palette()
barplot(x, col=1:6)
barplot(x, col=rainbow(5))
barplot(x, col=heat.colors(5))
barplot(x, col=terrain.colors(5))
barplot(x, col=topo.colors(5))
barplot(x, col=cm.colors(5))

# Clean Up ####
rm(list = ls())
dev.off()
