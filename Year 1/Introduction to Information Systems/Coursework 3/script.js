/**
 * The external JavaScript codes goes here.
 */

var i = 0; //declaring and initializing a variable i
var photos = []; //creating an array with name photos
var time = 3000; //declaring and initializing time variable

/*storing several images in different index of an array*/
photos[0] = "images/0.jpg";
photos[1] = "images/1.jpg";
photos[2] = "images/2.jpg";
photos[3] = "images/3.jpg";
photos[4] = "images/4.jpg";

/*creating a function slide for slideshow of the images*/
function slide() {
  document.change.src = photos[i]; //takes an image from the list within array and targets it to the img tag with name "change"

  if (i < photos.length - 1) {
    //checks for the proper index of images within the array
    i++; //increase value of i by 1 if condition is satisfied
  } else {
    //operates when condition is false
    i = 0; // makes the value of i to 0 for false condition
  }
  /*calls the slide() function every 3 second*/
  setTimeout("slide()", time);
}

/*whenever the page loads the slide function is invoked.*/
window.onload = slide;
