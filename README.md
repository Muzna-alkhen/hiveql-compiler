# hiveql-comiler
This project is an attempt to imitating hadoop / hiveql compiler, It takes a hiveql queries as a text file + a data files (csv files) then parse it and generate map/shuffle/reduce actions written in python that corsspond to the entered query. finally , it execute the python code to produce the final query result.
# The project Tools :
- implementation language : Java SE (JDK 1.8.0_25).
- IDE : intellij IDEA community edition (2018.3.5) .
- Parser tool : antlr 4.7.2 (JAR)
- Templates for code generation : StringTmaplate 4.1 (JAR)
- Executing the generated Code : python 3.7.3 Compiler

# Project info : 
# Parsing :
This Project  parses statements for :
-hiveql queries (create table statements + full select statements ).
-c++ statements (function declaration , variable declaration , for statement declaration , if statement declaration , assignment   statement ) .
- hiveql with c++ statements (assign query to variable , assign query result to variable)
# Syntax Checking : 
full syntax checks with underlining the syntax error in the console and printing line and column number of the error.
# Data Types : 
- store all of primitive types (Int – Bool – String – Real ) in a binary file by default .
- store new types (table) in a binary file with its own delimiter and location of csv files which added by create statements.
# Symbol Table : 
create symbol table that represents the declarative statements of the input.
# Abstract Syntax Tree : 
create AST for full select statements .
# Semantic checks : 
1.	Error for using undeclared variable;
2.	Error for using un-existed column of a type;
3.	Error in Multiple Declarations: a variable should be declared (in the same scope) at most once.
4.	Error while using of undeclared type (like table);
5.	Error for calling undeclared method;
6.	Everything in select statement should be in grouping if there is a grouping by clause.
7.	Having clause contains only grouping functions.
8.	Group by clause can’t contain aggregate function.
# code generating :
- generating map ,reduce and shuffle actions written in python code (targeted language)  .
- code generator can generate code for select statements include :
* aggregation functions clause (sum ,count,avg,min,max)  
* group by clause 
* where clause 
* order by clause  
# executing the generated code :
- execute the generated mappers , shuffler and reducers -in suitable order- which written in python using input data files (csv files)  to produce the final query result on a text file .

