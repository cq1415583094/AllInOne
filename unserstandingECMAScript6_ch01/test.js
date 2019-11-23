//测试var的变量提升机制

function getValue(bool) {
    if (bool) {
        var value = 30;
        console.log('value:', value);
        return value;
    } else {
        console.log('value:', value);
        return value;
    }
    console.log('value:', value); //这里可以访问到value，值为undefined 在该方法中 永远执行不到该一步
}

console.log(getValue(true)); //打印30
console.log(getValue(false)); //打印undefined
//console.log(value); //错误 value未定义

//总结：在getValue方法中，if中的变量value会提升到方法级别，但依然是局部变量(到方法块)
//在预编译阶段，js引擎会将getValue改为getValue2样式
function getValue2(bool) {
    var value;
    if (bool) {
        value = 30;
        console.log('value:', value);
        return value;
    } else {
        console.log('value:', value);
        return value;
    }
}

console.log(getValue2(true)); //打印30
console.log(getValue2(false)); //打印undefined

//基于以上机制 ES6 引入了块级作用域

function getValue3(bool) {
    if (bool) {
        //块级申明变量 let  只在if块中有效
        let value = 1;
        console.log('value:', value);
        return value;
    } else {
        console.log('value:', value); //错误 value未定义
        return null;
    }
}
getValue3(true);
//getValue3(false);

var count = 0;
var count = 1;
console.log(count);

//let count = 2; //错误 变量count已存在
//console.log(count);

//总结：在同一级中不可同时用 var 和 let 来申明同一个变量    (建议 let尽量伴随着'{}'同时使用)

{
    let count = 3;
    console.log(count); //3
}

//ES中同时引入了常量申明 const，该申明的常量必须赋值且不可变
const num = 30;
// num = 31; //错误 num未常量值 不可变
console.log(num);

// const n; //错误 常量申明未初始化
// n = 20;
// console.log(n);

//常量申明后必须马上进行初始化，且不可修改

const numList = [1, 2];
numList.push(3);
console.log(numList); // [1, 2, 3]
// numList = [1, 2]; //错误
// console.log(numList);

const numObj = {'n1': 1, 'n2': 2};
numObj['n3'] = 3;
console.log(numObj); //{'n1': 1, 'n2': 2, 'n3': 3}

{
    const NUM = 1;
    console.log(NUM); //1
}
// console.log(NUM); //错误 NUM未定义

//总结：常量不可重新赋值，但可以修改值的内部信息。const申明与let一样  只在当前块中有效

var funcs = [];

for (var i = 0; i < 10; i++) {
    funcs.push(function(){
        console.log(i);
    });
}

funcs.forEach(function(func){
    func();
}); //10个10

console.log('↓↓↓↓↓↓↓↓↓ 改进 ↓↓↓↓↓↓↓↓');

//改进
var funcs = [];
for (var i = 0; i < 10; i++) {
    funcs.push((function(value){
        return function(){
            console.log(value);
        }
    }(i)));
}
funcs.forEach(function(func){
    func();
});

console.log('↓↓↓↓↓↓↓↓ ES6 let ↓↓↓↓↓↓↓↓↓↓');

var funcs = [];
for (let i = 0; i < 10; i++) {
    funcs.push(function(){
        console.log(i);
    });
}
funcs.forEach(function(func){
    func();
});
