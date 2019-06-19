public class Main {
    public static void main(String[] args) {
Point point=new Point(1,1);
System.out.println(point);
MovablePoint movablePoint= new MovablePoint(2,2);
System.out.println(movablePoint);
movablePoint.move();
        System.out.println(movablePoint);

    }

    static class Point {
        private float x = 0.0f, y = 0.0f;

        public Point() {
        }

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return this.x;
        }

        public float getY() {
            return this.y;
        }

        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float[] getXY() {
            return new float[]{getX(), getY()};
        }

        public String toString() {
            return "Point has X= "
                    + getX()
                    + " Y= "
                    + getY()
                    ;
        }
    }

    static class MovablePoint extends Point {
        private float xSpeed = 0.0f, ySpeed = 0.0f;

        public MovablePoint() {
        }

        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MovablePoint(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float getxSpeed() {
            return this.xSpeed;
        }

        public float getySpeed() {
            return this.ySpeed;
        }

        public void setxSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public void setySpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }
        public float[] getSpeed()
        {
            return new float[]{getxSpeed(),getySpeed()};
        }
        public String toString()
        {
            return "MovaablePoint X= "
                    +super.getX()
                    +" Y= "
                    +super.getY()
                    +" xSpeed = "
                    +getxSpeed()
                    +" ySpeed = "
                    +getySpeed();
        }
        public MovablePoint move()
        {
            super.setX(super.getX()+getxSpeed());
            super.setY(super.getY()+getySpeed());
            return this;
        }
    }
}
