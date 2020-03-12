See https://github.com/spring-projects/spring-framework/issues/24685

Run `mvn test`

* Expected: Success
* Actual: Failure

Note: renaming `AbstractClassSomeUnrelatedTest` to `XAbstractClassSomeUnrelatedTest` make the tests pass.

With `AbstractClassSomeUnrelatedTest`:
```
[INFO] Running TestSuite
new bean
(abstract) class pkg.a.ConcreteClass1Test
class pkg.b.BeforeConcreteDirtiesContextTest
[ERROR] Tests run: 4, Failures: 1, Errors: 0, Skipped: 1, Time elapsed: 0.345 s <<< FAILURE! - in TestSuite
[ERROR] setUp(pkg.a.ConcreteClass1Test)  Time elapsed: 0.005 s  <<< FAILURE!
java.lang.AssertionError
        at pkg.a.ConcreteClass1Test.setUp(ConcreteClass1Test.java:16)
```

With `XAbstractClassSomeUnrelatedTest`:

```
[INFO] Running TestSuite
new bean
(abstract) class pkg.a.ConcreteClass1Test
class pkg.a.ConcreteClass1Test
class pkg.b.BeforeConcreteDirtiesContextTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.372 s - in TestSuite
```