# Linear Program using sets
# From section 1.4 of AMPL Book

set Products;

# {} --> indexing operator in AMPL
param tonsPerHour {Products} > 0 ;  # each tonsPerHour must be greater than 0
param profitPerTon {Products};  # there is a profit per ton for each element of the Products set
param maximumTons {Products} >= 0;
param totalTime >= 0;

# decision variable --> one for each element in the Products set
var tonsToBeMade {p in Products};

# objective function
maximize totalProfit: sum {p in Products} profitPerTon[p] * tonsToBeMade[p];

# constraints
subject to time: sum {p in Products} 
	((1 / tonsPerHour[p]) * tonsToBeMade[p]) <= totalTime;
subject to limit {p in Products}: 0 <= tonsToBeMade[p] <= maximumTons[p];
