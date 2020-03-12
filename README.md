See https://github.com/spring-projects/spring-framework/issues/24685

Run `mvn test`

* Expected: Success
* Actual: Failure

Note: renaming `AbstractClassSomeUnrelatedTest` to `XAbstractClassSomeUnrelatedTest` make the tests pass.