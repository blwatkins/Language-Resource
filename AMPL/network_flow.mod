# Brittni Watkins
# CSE 8355
# 6 November 2018
# Homework 6: Network Flow Problem
# Model File

set NODES;
set ARCS within (NODES cross NODES);

param supply {NODES};
param cost {ARCS} >= 0;
param lower {ARCS} >= 0;
param  upper{(i,j) in ARCS} >= lower[i, j];

var send{(i, j) in ARCS} >= 0;

minimize TotalCost: sum {(i, j) in ARCS} cost[i, j] * send[i, j];

subject to NodeBalance {n in NODES}: 
	sum {(n, i) in ARCS} send[n, i] - sum{(j, n) in ARCS} send[j, n] 
		= supply[n];
		
subject to ArcCapacity {(i, j) in ARCS}: lower[i, j] <= send[i, j] <= upper[i, j]; 