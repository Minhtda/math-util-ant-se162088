/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhminh.mathutil.core.test;


import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.anhminh.mathutil.core.MathUtil.getFactorial;
// import static tên =  class.tênhàm; thì sau này
// khi gọi hàm static bỏ luôn tên class chấm, hiểu ngầm tên class
//code gọi như hàm của c
// * là đại diện cho tất cả các hàm static trong class vừa import 
// nếu rảnh thì chấm từng tên hàm static (ko có dấu ngoặc)
/**
 *
 * @author minhd
 */
// KĨ THUẬT DDT = DATA DRIVEN TESTING
// TRANHAS NHẦM LẪN VỚI TDD =  TEST DRIVEN DEVELOPMENT
//ĐT: KĨ THUẬT SỐ TỔ CHUCWCS CÁC TEST CASES CHO GỌN GÀNG
// TÁCH CÁC CÂU LỆNH KIỂM THỬ VÀ BỘ DATA DÙNG ĐỂ TEST RIÊNG RA 2 NƠI
//PHIÊN BẢN TEST UNIT VỪA HỌC ĐANG TRỘN DATA TEST VÀ GỌI HÀM
//LẪN LỘN VỚI NHAU, KO SAI, NHƯNG NHÌN KHÔNG GỌN GÀNG
// Nếu ta muốn check hàm getF() với các giá trị đầu vào và có trả về
//đầu ra mong đợi hay ko, kiểu như
// 0 --> 1
// 1 --> 1
// 2 --> 2
// 3 --> 6
// 4 --> 24
// 5 --> 120
// 6 --> 720
//...
// Có chỗ nào định nghĩa riêng cái đám data này, thì ta sẽ dễ dàng 
//cảm nhận các case đã đủ hay chưa, đã đại diện đủ hay chưa?
//Lát hồi ta nhồi cái đám data này vào hàm assertEquals(? getF(?))
//Cảm giác viết code để test hàm nhìn rõ ràng hơnngược lại vào
//chỗ gọi hàm, kĩ thuật này gọi là DDT =  viết test case theo kiểu
//hướng về tách data cho dễ đọc, còn gọi là PARAMETERIZED TESTING
//Kĩ thuật đẩy data test ra 1 chỗ khá, lát hồi nhồi 
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //chuẩn bị data để nhồi vào hàm test
    // quy ước hàm chuẩn bị data phải là static - nằm ở 1 
    //trong ram để object nào cũng thấy được
    @Parameterized.Parameters
    public static Object[][] intitData() {
            return new Integer[][] {
                                     {0, 1},
                                     {1, 1},
                                     {2, 2},
                                     {3, 6},
                                     {4, 24},
                                     {5, 120},
                                     {6, 720}
            };
        }
    @Parameterized.Parameter(value = 0) // map biến này vào cột 0
    public int n;
    @Parameterized.Parameter(value = 1) 
    public long expected; //2 biến này mang vào  2 cột tương ứng 
                          // của hàm initData
                          //sau đó ta nhồi 2 biến này vào trong hàm

    @Test
    public void testFactorialGivenRightAgumentReturnsWell(){
        assertEquals(expected, getFactorial(n));
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {} 
}
