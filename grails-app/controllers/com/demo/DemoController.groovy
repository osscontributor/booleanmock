package com.demo

class DemoController {

    def myService
    
    def index() { 
        def result = myService.someMethod('')
        render "Result: ${result}"
    }
}
