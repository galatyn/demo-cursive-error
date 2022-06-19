# demo-cursive-error

Env to reproduce the issue:
- macOS 12.4
- IntelliJ IDEA 2022.1.2 (Ultimate edition)
- Cursive 1.12.4-2022.1 

## Step to reproduce

- Open project in IDEA
- Run REPL (run button at toolbar, there should be configuration already)
- Run `min-test` in REPL

Expected result:
  Test should be ok.

Actual result:
```
Clojure 1.11.1
nREPL server started on port 52242 on host 127.0.0.1 - nrepl://127.0.0.1:52242
Loading test/demo_cursive_error/core_test.clj... done
Running demo-cursive-error.core-test/min-test
Error handling response - class java.lang.IllegalArgumentException: Argument for @NotNull parameter 'name' of com/intellij/psi/search/FilenameIndex.getVirtualFilesByName must not be null
Error handling response - class java.lang.IllegalArgumentException: Argument for @NotNull parameter 'name' of com/intellij/psi/search/FilenameIndex.getVirtualFilesByName must not be null
Error handling response - class java.lang.IllegalArgumentException: Argument for @NotNull parameter 'name' of com/intellij/psi/search/FilenameIndex.getVirtualFilesByName must not be null
Error handling response - class java.lang.IllegalArgumentException: Argument for @NotNull parameter 'name' of com/intellij/psi/search/FilenameIndex.getVirtualFilesByName must not be null
Error handling response - class java.lang.IllegalArgumentException: Argument for @NotNull parameter 'name' of com/intellij/psi/search/FilenameIndex.getVirtualFilesByName must not be null
```
