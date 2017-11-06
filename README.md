# scalamock-fail-with-scalajs

* Scala 2.12.4
* Scala.js 0.6.20
* sbt 1.0.2
* ScalaTest 3.0.4
* ScalaMock 3.6.0 

`sbt test` will fail showing error message like below.

```bash
sbt:foo> test
[info] Compiling 1 Scala source to C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\test-classes ...
[info] Done compiling.
[info] Fast optimizing C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js
[error] org.scalajs.testcommon.RPCCore$RPCException
[error]         at org.scalajs.testcommon.RPCCore.$anonfun$handleMessage$4(RPCCore.scala:54)
[error]         at scala.Option.foreach(Option.scala:257)
[error]         at org.scalajs.testcommon.RPCCore.$anonfun$handleMessage$1(RPCCore.scala:52)
[error]         at org.scalajs.testcommon.RPCCore.$anonfun$handleMessage$1$adapted(RPCCore.scala:32)
[error]         at org.scalajs.testcommon.Serializer$.withInputStream(Serializer.scala:48)
[error]         at org.scalajs.testcommon.RPCCore.handleMessage(RPCCore.scala:32)
[error]         at org.scalajs.testadapter.ComJSEnvRPC$$anon$1.run(ComJSEnvRPC.scala:34)
[error] Caused by: scala.scalajs.js.JavaScriptException: TypeError: Cannot read property 'FooTest' of undefined
[error]         at org.scalajs.testinterface.TestUtils$.deepSelect(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:4929)
[error]         at org.scalajs.testinterface.TestUtils$.newInstance(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:4880)
[error]         at org.scalatest.tools.TaskRunner.executionFuture(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:19877)
[error]         at org.scalatest.tools.TaskRunner.execute(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:19839)
[error]         at org.scalajs.testinterface.internal.Slave.execute(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:5359)
[error]         at <jscode>.{anonymous}()(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:5518)
[error]         at scala.scalajs.runtime.AnonFunction1.apply(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:27089)
[error]         at <jscode>.{anonymous}()(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:12448)
[error]         at scala.scalajs.runtime.AnonFunction1.apply(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:27089)
[error]         at <jscode>.{anonymous}()(C:\Users\xxxxxxxx\IdeaProjects\scalamock-fail-with-scalajs\target\scala-2.12\foo-test-fastopt.js:26381)
[error] Could not run test foo.FooTest: org.scalajs.testcommon.RPCCore$RPCException
[info] EndTestGroupErrorEvent(foo.FooTest, null
[info] org.scalajs.testcommon.RPCCore.$anonfun$handleMessage$4(RPCCore.scala:54)
[info] scala.Option.foreach(Option.scala:257)
[info] org.scalajs.testcommon.RPCCore.$anonfun$handleMessage$1(RPCCore.scala:52)
[info] org.scalajs.testcommon.RPCCore.$anonfun$handleMessage$1$adapted(RPCCore.scala:32)
[info] org.scalajs.testcommon.Serializer$.withInputStream(Serializer.scala:48)
[info] org.scalajs.testcommon.RPCCore.handleMessage(RPCCore.scala:32)
[info] org.scalajs.testadapter.ComJSEnvRPC$$anon$1.run(ComJSEnvRPC.scala:34))
[error] java.lang.NullPointerException
[error]         at sbt.JUnitXmlTestsListener$TestSuite.$anonfun$stop$2(JUnitXmlTestsListener.scala:86)
[error]         at scala.collection.TraversableLike.$anonfun$map$1(TraversableLike.scala:234)
[error]         at scala.collection.immutable.List.foreach(List.scala:389)
[error]         at scala.collection.generic.TraversableForwarder.foreach(TraversableForwarder.scala:35)
[error]         at scala.collection.generic.TraversableForwarder.foreach$(TraversableForwarder.scala:35)
[error]         at scala.collection.mutable.ListBuffer.foreach(ListBuffer.scala:44)
[error]         at scala.collection.TraversableLike.map(TraversableLike.scala:234)
[error]         at scala.collection.TraversableLike.map$(TraversableLike.scala:227)
[error]         at scala.collection.AbstractTraversable.map(Traversable.scala:104)
[error]         at sbt.JUnitXmlTestsListener$TestSuite.stop(JUnitXmlTestsListener.scala:82)
[error]         at sbt.JUnitXmlTestsListener.writeSuite(JUnitXmlTestsListener.scala:190)
[error]         at sbt.JUnitXmlTestsListener.endGroup(JUnitXmlTestsListener.scala:171)
[error]         at sbt.TestRunner.$anonfun$run$8(TestFramework.scala:118)
[error]         at sbt.TestRunner.$anonfun$run$8$adapted(TestFramework.scala:118)
[error]         at sbt.TestFramework$.$anonfun$safeForeach$1(TestFramework.scala:139)
[error]         at sbt.TestFramework$.$anonfun$safeForeach$1$adapted(TestFramework.scala:138)
[error]         at scala.collection.Iterator.foreach(Iterator.scala:929)
[error]         at scala.collection.Iterator.foreach$(Iterator.scala:929)
[error]         at scala.collection.AbstractIterator.foreach(Iterator.scala:1417)
[error]         at scala.collection.IterableLike.foreach(IterableLike.scala:71)
[error]         at scala.collection.IterableLike.foreach$(IterableLike.scala:70)
[error]         at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
[error]         at sbt.TestFramework$.safeForeach(TestFramework.scala:138)
[error]         at sbt.TestRunner.safeListenersCall(TestFramework.scala:124)
[error]         at sbt.TestRunner.run(TestFramework.scala:118)
[error]         at sbt.TestFramework$$anon$2$$anonfun$$lessinit$greater$1.$anonfun$apply$1(TestFramework.scala:258)
[error]         at sbt.TestFramework$.sbt$TestFramework$$withContextLoader(TestFramework.scala:229)
[error]         at sbt.TestFramework$$anon$2$$anonfun$$lessinit$greater$1.apply(TestFramework.scala:258)
[error]         at sbt.TestFramework$$anon$2$$anonfun$$lessinit$greater$1.apply(TestFramework.scala:258)
[error]         at sbt.TestFunction.apply(TestFramework.scala:267)
[error]         at sbt.Tests$.$anonfun$toTask$1(Tests.scala:276)
[error]         at sbt.std.Transform$$anon$3.$anonfun$apply$2(System.scala:44)
[error]         at sbt.std.Transform$$anon$4.work(System.scala:64)
[error]         at sbt.Execute.$anonfun$submit$2(Execute.scala:257)
[error]         at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error]         at sbt.Execute.work(Execute.scala:266)
[error]         at sbt.Execute.$anonfun$submit$1(Execute.scala:257)
[error]         at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:167)
[error]         at sbt.CompletionService$$anon$2.call(CompletionService.scala:32)
[error]         at java.util.concurrent.FutureTask.run(Unknown Source)
[error]         at java.util.concurrent.Executors$RunnableAdapter.call(Unknown Source)
[error]         at java.util.concurrent.FutureTask.run(Unknown Source)
[error]         at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
[error]         at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
[error]         at java.lang.Thread.run(Unknown Source)
[error] java.lang.NullPointerException
[info] Run completed in 5 seconds, 731 milliseconds.
[info] Total number of tests run: 0
[info] Suites: completed 0, aborted 0
[info] Tests: succeeded 0, failed 0, canceled 0, ignored 0, pending 0
[info] No tests were executed.
[error] Error during tests:
[error]         foo.FooTest
[error] (test:test) sbt.TestsFailedException: Tests unsuccessful
[error] Total time: 27 s, completed 2017/11/06 7:18:40
```


