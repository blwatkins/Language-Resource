class Circle {

    constructor(x, y) {
        this.x = x;
        this.y = y;
        this.d = random(10, 50);
        this.grey = random(150);
        this.alpha = 255;
    }

    display() {
        noStroke();
        fill(this.grey, this.alpha);
        ellipse(this.x, this.y, this.d, this.d);
    }

    fade() {
        this.alpha--;
    }

}
