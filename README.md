A sample project to show the bug in the Intellij Idea 
[built-in lombok plugin](https://github.com/mplushnikov/lombok-intellij-plugin/tree/intellij_master)

For the accessors of your properties to use
[JavaBeans Specification](https://download.oracle.com/otndocs/jcp/7224-javabeans-1.01-fr-spec-oth-JSpec/) (§8.8),
you can add `lombok.accessors.capitalization = beanspec` to your **lombok.config**.
Thus, for a field like `aName` you will get `getaName()` and `setaName(...)`.
This compiles and runs as expected.

However, Intellij Idea will highlight your accessors as erroneous which is unfortunate, 
because you lose all the advantages of the IDE, e.g. autocompletion.
![works fine, but highlighted as error](/assets/images/works.png)
Moreover, the IDE will confuse you by suggesting you the accessor names which won't even compile &ndash; 
`getAName()` and `setAName(...)`.
![seems like everything is ok, but won't compile](/assets/images/doesntwork.png)
