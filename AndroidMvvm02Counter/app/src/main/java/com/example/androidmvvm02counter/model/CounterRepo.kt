package com.example.androidmvvm02counter.model

class CounterRepo {
    private var _counter = CounterData(0)

    fun updateCounter(delta: Int): CounterData {
        _counter = _counter.copy(count = _counter.count + delta)
        return _counter
    }
}
