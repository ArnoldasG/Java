# Java #Spring
Spring Setter based Dependency Injection

1. Created two implementations of a business service. (cloudService and ecommerceService)
2. Our bean organisation contains the BusinessService of the type businessService, which was our interface. 
3. And our goal was to swap out implementations of business service in organisation whenever we wanted to bases on business development,
based on some business requirement. 

Litlle bit about dependency injection
In earlier days when dependency injection wasn't used, we weren't able to do that. We would've had to actually instatiate directly in Organisation
class field, rather then using dependency injection and basically making the changes via, in this case, setting those values. 

And the way we achieved this was in out beans.xml. We defined our two services, cloudService and ecommerceService, as beans in our configuration file.
And organisation class is obviously also defined in the same file. The organisation bean has a REFERENCE attribute businessService, which can be swapped
out or can be swapped and changed between the cloudService or ecommerceService based on a business requirement. We are just changing the reference attribute
here and the property of the organisation being this businessService. And then we just get our DISetterApp to run. It's got no particular idea what's gonna be
coming back from the corporateService and the dependency injection happens automatically in effect, and we don't need to worry about tightly coupled code any more. 

____
Definition of Setter-based Dependency Injection


Setter-based DI is accomplished by the container calling setter methods on your beans after invoking a no-argument constructor or no-argument static factory 
method to instantiate your bean.
„Seter-based“  atliktas DI atliekamas naudojant "beans" konteinerio iškvietos nustatymo metodus, kai "beans" yra iškviečiama be argumento konstruktoriaus 
arba be argumento statinio gamyklos metodo.
