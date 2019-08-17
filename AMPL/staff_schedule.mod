set DAYS;
set EMPLOYEES_PRESENT within (DAYS cross DAYS);

param requiredEmployees {DAYS} >= 0;

var employeesStarting {d in DAYS} integer >= 0;

minimize numEmployees: sum {d in DAYS} employeesStarting[d];

subject to minEmployees {d in DAYS} : sum{(d, d2) in EMPLOYEES_PRESENT} employeesStarting[d2]  >= requiredEmployees[d];