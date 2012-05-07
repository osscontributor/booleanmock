package com.demo



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(DemoController)
class DemoControllerTests {

    void testSomething() {
        def mockService = mockFor(MyService)
        mockService.demand.someMethod(1..1) { String xml ->
            false
        }
        controller.myService = mockService.createMock()
        
        controller.index()
        
        assert 'Result: false' == response.text
    }
}
