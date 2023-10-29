//input:[1,1,1,0,0,0,2,2,2]
let input=[1,1,1,0,0,0,2,2,2]
let temp
for(let i=0;i<input.length;i++){
    for(let j=i;j<input.length;j++){
        if(input[i]>input[j]){   //input[1]>input[1]=f,1>1-f,1>1>-f,1>0-t,temp=input[1],input[i]=input[0],input[j]=1(temp)
            temp=input[i]
            input[i]=input[j]
            input[j]=temp
        }
    }
}
console.log(input)

