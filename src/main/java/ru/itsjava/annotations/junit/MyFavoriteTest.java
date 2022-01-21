package ru.itsjava.annotations.junit;

public class MyFavoriteTest {

    @BeforeAll
    public void beforeAllMethod(){
        System.out.println("Before All");
    }

    @Test
    public void test1() {
    }

//    @Test
//    public void test2() { throw new RuntimeException();
//    }

    @AfterAll
    public void test5() {
        System.out.println("AfterAll");
    }

    @After
    public void test6() {
        System.out.println("After");
    }

    @Before
    public void test7() {
        System.out.println("Before");
    }


    @Test
    public void test3() {
    }

//    @Test
//    public void test4() {
//        throw new RuntimeException();
//    }

    @DisplayName(message = "тест8")
    public void test8() {
    }

    @DisplayName(message = "Тест Супер")
    public void testSuper() {
    }
}
