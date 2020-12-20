package main

import (
	"fmt"
	"io/ioutil"
)

func main() {
	//file, error := ioutil.ReadFile("foo.txt")
	//if error!=nil{
	//	fmt.Println(error)
	//	return
	//}
	//fmt.Println(file)
	res, error := Half(19)
	if error != nil {
		fmt.Println(error)
		return
	}
	fmt.Println(res)
}
func readFile(filename string) ([]byte, error) {
	var file []byte
	var err error
	file, err = ioutil.ReadFile("foo.txt")
	return file, err
}
func Half(numberToHalf int) (int, error) {
	if numberToHalf%2 != 0 {
		return -1, fmt.Errorf("cannot half %v", numberToHalf)
	}
	return numberToHalf / 2, nil
}
