package goLearn

import (
	"fmt"
)

func helloName (s string ) string {

	return "Hello "+s
}
func addition(a int,b int) int  {
	return a+b;
}
func showMemoryAddress(x int) {
  fmt.Println(&x)
return
}
func showMemoryAddress2(x *int) {
	fmt.Println(x)
	return
}
func main()  {
	/*fmt.Println(helloName("Tangtang"))
	fmt.Println(helloName("world"))
	fmt.Println(addition(100,200))
	//var s string="OneWorld"
	//fmt.Println(addition(100,helloName("OneWorld")))
	//fmt.Println(addition(100,s))
	var b bool
	fmt.Println(b)

	//变量转变为string类型
	formatBool := strconv.FormatBool(b)
	fmt.Println(formatBool)
	var f float64=153.456
	//reflect 查看变量的类型
	fmt.Println(reflect.TypeOf(f))

	var s string="true"
	parseBool, err := strconv.ParseBool(s)
	if err==nil{
		fmt.Println(parseBool)
	}*/
	var str,str1 string="abc","def"
	var (
		/*i int=123
		str2 string="2456"
		array  = [5]float32{1000.0, 2.0, 3.4, 7.0, 50.0}
		//切片
		cheese=make([]string,2)*/
		//键值对
		players=make(map[string]int)
	)
    var a int
    var b string
    var c []string
    var d bool
    fmt.Println(a,b,c,d,str,str1)
	if c==nil{
		fmt.Println("C没有被赋值")
	}
   //fmt.Println(i,str2,array[4])
	//fmt.Println(&array[4])
	//fmt.Println(&i)
	//showMemoryAddress(i)
	//showMemoryAddress2(&i)
	////
	//const create ="Hello Word"
	//fmt.Println(create)
	////create="nihao"
	//price, good := getprice()
	//fmt.Print("商品是：",good,"\n价格是：",price,"\n")
	////多参数
	//fmt.Println(suNumbers(1,2,3,4))
	////递归学习
	//fmt.Println(feedMe(1,0))
	//fn := func() string{
	//	return "function called"
	//}
	//fmt.Println(fn())
	//cheese[0]="LiuYiFei"
	//cheese[1]="DiLiReBa"
	//fmt.Println(cheese[0],cheese[1],cheese)
   //
	////切片添加元素
	//cheese= append(cheese, "古力娜扎","马尔扎哈")
	////切片删除元素(删除第三个元素)
	//fmt.Println(cheese)
	//cheese = append(cheese[:2],cheese[2+1:]...)//[LiuYiFei DiLiReBa 古力娜扎 马尔扎哈]
	//fmt.Println(len(cheese))
	//fmt.Println(cheese)//[LiuYiFei DiLiReBa 马尔扎哈]
	////复制切片中的元素
	//var smellycheese = make([]string,4)
	//copy(smellycheese,cheese[1:])
	//fmt.Println(smellycheese)//[DiLiReBa 马尔扎哈]
	//键值对，映射
	players["cook"]=32
	players["bairstow"]=27
	players["stokes"]=26
	fmt.Println(players)
	fmt.Println(players["cook"])
	//删除元素
	delete(players,"cook")
	fmt.Println(players["cook"])
}
func getprice() (x int,y string){
	i := 2
	s:= "goldfish"
	return i,s
}
func suNumbers(numbers...int) int {
	total := 0
	for _,number := range numbers {

		total+=number
	}
	return total
}
func feedMe(portion int,eaten int) int{
	eaten+=portion
	if eaten>4{
		fmt.Println("I am full,I have eaten")
		return eaten
	}
	fmt.Println("I still hungry!I have eaten ",eaten)
	return feedMe(portion,eaten)
}
//将方法作为一个参数传入另一个方法
func anotherFunction(fn func() string) string  {
	return fn()
}