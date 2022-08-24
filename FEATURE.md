# ONE Coding Exercise: feature development

Now that you've worked way through a handful of bugs (thank you!), we'd like to
get your help implementing a new feature to the `MemoryCache`. You may have already
seen some `TODO`s in the code referencing this feature that you'll be adding, but
we'll recap below.

## Feature

You can see that the `set` method takes an _optional_ parameter to expire an item. This
parameter's name is different across languages and has one of the following names:

- Java: `expireAfterMS`
- Javascript: `expireAfterMS`
- Go: `expireAfter`
- Python: `expire_after_seconds`

The feature has **three main requirements** that we'll detail here:

1. When the `get` method is called, if the item exists but its expiry time has passed,
   we should **clear** the item _right then_.

2. Even if `get` is never called, the `MemoryCache` should _automatically_ clear expired
   items from the cache in the background. The cache includes a `Scheduler` for running
   scheduled background tasks.

3. Finally, in addition to implementing this feature, it'd also be great to implement _test coverage_
   to give us confidence in the implementation. At the bottom of the `MemoryCache` test file, you'll find
   a stubbed out test that you can use.

Does this all make sense to you? Do you have any questions about the _requirements_ of this feature?
