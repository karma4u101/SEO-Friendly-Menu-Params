SEO Friendly Menu Params
========================

Provides simple examples of menu params usage in Lift with search engine optimization friendly url:s
Menu entry point ParamTest contains a barebones example wile the Countries menu entry point also uses SEO friendly urls
To make things easy to follow the examples has extensive logging. 

Getting Started
---------------
The only prerequisites for running this Lift example is that you have Git and Java installed and configurated on the target comp.
If you use Eclipse the project also includes a Eclipse plugin see below   

1) Get the examples

	git clone git@github.com:karma4u101/SEO-Friendly-Menu-Params.git
	cd SEO-Friendly-Menu-Params

2) Update & Run Jetty 
There is also a sbt.bat for windows users.

	./sbt update ~container:start

3) Launch Your Browser
	
	http://localhost:8080/

Scala IDE for Eclipse
---------------------
Sbteclipse provides SBT command to create Eclipse project files

1) Usage

	project$ ./sbt
	> eclipse create-src

2) In eclipse do: 

	File ==> Import...
	Select General ==> Existing Project into Workspace 
	Use "Brows" to look up the project root ....

