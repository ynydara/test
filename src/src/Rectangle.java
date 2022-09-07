public class Rectangle {
    //attributes
    double width;
    double height;

    //constructors
    Rectangle() {
        width = 1;
        height = 1;
        //Rectangle(){
// this(1,1);
//replace the width and height with this comment.
    //}

    }
    Rectangle(double width, double height){
        if (width > 0 && height > 0){
            this.width = width;
            this.height = height;

        }
    }
}


