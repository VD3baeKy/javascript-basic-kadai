const options = {
  //weekday: 'long',
  year: 'numeric',
  month: 'long',
  day: 'numeric',
};
const dateTimeFormat = new Intl.DateTimeFormat('ja-JP', options);
console.log( dateTimeFormat.format(Date.now()) );