# Learning R
# Importing Data

# Install and Load Packages ####
if (!require("pacman")) install.packages("pacman")
pacman::p_load(pacman, party, rio, tidyverse)

# Load and Prepare Data ####
df <- read_csv("data/StateData.csv")
df

# Clean Up ####
rm(list = ls())

# clear packages
p_unload(all)
