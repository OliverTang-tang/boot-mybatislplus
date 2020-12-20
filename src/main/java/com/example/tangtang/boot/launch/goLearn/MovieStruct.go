package goLearn

import (
	"fmt"
	"strconv"
)

type Movie struct {
	Name string
	Rating float64
}
func (m *Movie) summary() string {
	r := strconv.FormatFloat(m.Rating, 'f', 5, 32)
	return m.Name + ", "+ r
}

func main(){
	//类似于java中的匿名构造
	movie := Movie{
		Name:   "tangtang",
		Rating: 10,
	}
	fmt.Println(movie.Name,movie.Rating)
	fmt.Println(movie.summary())
	//创建一个变量
	var m Movie
	fmt.Println("%+v",m)
	m.Name="tangtang"
	m.Rating=20
	fmt.Println("%+v",m)
	//new一个
	 new :=new(Movie)
	 new.Name="tangtang"
	 new.Rating=30
	 fmt.Println("%+v",new)
	 shotMovie :=Movie{"tangtang",24}
	 fmt.Println(shotMovie)
}