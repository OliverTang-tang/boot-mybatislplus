package main

import (
	//"bytes"
	//"fmt"
	"fmt"
	"strings"
)

func main()  {
	//var buffer bytes.Buffer
	//for i := 0;i<500;i++{
	//	buffer.WriteString("tangshuaizuishuai\n ")
	//}
	//fmt.Println(buffer.String())

	//stringsIndex 返回第一索引，送0开始，没有返回-1
	fmt.Println(strings.Index("tangtangzuishuai","zui"))
	//strings.TrimeSpace 删除开头和末尾的空白
	fmt.Println(strings.TrimSpace(" tang tang zui shuai 96      "))
	//strings.ToLower(),转小写
	fmt.Println(strings.ToLower(" tang TanG zui shuai 96      "))

}
