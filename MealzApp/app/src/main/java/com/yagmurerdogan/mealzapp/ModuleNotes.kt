package com.yagmurerdogan.mealzapp

/*
    --- Introduction to MVC, MVP and MVVM ---

    Presentation patterns are design patterns,
     and they are here to help us in developing
     good applications  and scalable projects
     that have decoupled components.

    --- MVC

    View(xml) -> Controller Activity ->Model

    Disadvantages:

    Your code is highly coupled - no separation of concerns
    Difficult to test
    The project is difficult to maintain
    Little scalability

    --- MVP

    View(Activity/Fragment) <-> Presenter -> Model

    --- MVVM

    View(Activity/Fragment) -> ViewModel -> Model

    Advantages:

    Your code is decoupled - separation of concerns
    Code is easily testable
    The package structure is even easier to navigate
    THe project is even easier to maintain
    Scalable - your team can add new features even more
    quickly

    -> ViewModel is a class that is responsible for
    preparing and managing the state of the UI for
    Fragments or Activities, or composable.



    --- Gson and JSON are not same ---

    Gson deserialization:
    JSON -> data classes


    
    --- What is a Coroutine? ---

    A coroutine is a as a light-weight thread
    Like threads, coroutines can run in parallel,
    wait for each other and communicate
    The biggest difference is that coroutines are very cheap,
    almost free, we can create thousands of them,
    and pay very little in terms of performance

    --- What are coroutines for?
    -> Async work
    -> Multi threading

    --- How do you handle async work with coroutines?
    -> Mark async methods as suspended and create a coroutine
    to listen for the result

    --- What concepts do Coroutines bring?
    -> Suspend function
    -> Coroutine builders
    -> Coroutine scopes and dispatchers

    --- Suspend Functions
    -> The method associated with this modifier is
    asynchronous and will not be returned immediately

    How do you mark a method as suspendable?
    -> suspend fun mySuspendFunction():String

    one can call suspended functions from other
    suspended functions or inside a coroutine


    --- Coroutine builders
    -> Coroutine builders are simple functions that can create
    a coroutine and act as a bridge between the normal world
    and the suspending world. They are called on scopes.

    --Types
    -> launch - launches coroutine and forgets
    -> async - returns a deferred object
    -> runBlocking - runs on Main thread

    --- Coroutine scopes and dispatchers
    -> The scope object of a Coroutine dictates how long
    the coroutine should live and wait for results

    --Predefined scopes
    -> GlobalScope
    ->lifecycleScope
    ->rememberCoroutineScope
    ->viewModelScope

    --- How is custom scope defined?
    -> By passing a job and a Dispatcher

    --- What is a job?
    -> A job can be used as handle coroutine where we can
    track the wait time and cancel it

    -> What is a Dispatcher?
    -> It is used to specify which thread a coroutine
    uses for its execution. One can specify the dispatcher
    to the builder

    -- Dispatcher Types
    -> Main - UI
    -> Default - CPU
    -> IO - networking or file access

 */