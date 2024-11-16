let num = 18;
//if(num%3==0.0 && num%5!=0.0){ //%は余りを出す=小数とはならない
if(num%3==0 && num%5!=0){
   console.log("3の倍数です");
//}else if(num%3!=0.0 && num%5==0.0){ //%は余りを出す=小数とはならない
}else if(num%3!=0 && num%5==0){
   console.log("5の倍数です");
//}else if(num%3==0.0 && num%5==0.0){ //%は余りを出す=小数とはならない
}else if(num%3==0 && num%5==0){
   console.log("3と5の倍数です");
}
