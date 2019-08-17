# Linear Program Model from Section 1.2

var x_b;
var x_c;

maximize Profit: (25 * x_b) + (30 * x_c);

subject to time: ((1/200) * x_b + (1/140) * x_c) <= 40;
subject to b_limit: 0 <= x_b <= 6000;
subject to c_limit: 0 <= x_c <= 4000;
