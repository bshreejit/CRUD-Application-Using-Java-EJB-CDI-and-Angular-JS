var app=angular.module("app" , [])

app.controller("FilterController",['filterFilter', function(filterFilter){
    this.array=["Hello" , "What's" , "Up"]
    this.filteredArray = filterFilter(this.array, 'a');
}])