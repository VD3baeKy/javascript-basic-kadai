const btn = document.getElementById('btn');
const text = document.getElementById('text');

//イベント処理
btn.addEventListener('click', () => {
  //非同期処理
  setTimeout(() => {
    document.getElementById('text').innerHTML = "ボタンをクリックしました";
  }, 2000);
});
