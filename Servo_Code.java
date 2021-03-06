 double tgtPower = 0;
    while (opModeIsActive()) {
        tgtPower = -this.gamepad1.left_stick_y;
        motorTest.setPower(tgtPower);
        if(gamepad1.y) {
            servoTest.setPosition(0);
        } else if (gamepad1.x || gamepad1.b) {
            servoTest.setPosition(0.5);
        } else if (gamepad1.a) {
            servoTest.setPosition(1);
        }
        telemetry.addData("Servo Position", servoTest.getPosition());
        telemetry.addData("Target Power", tgtPower);
        telemetry.addData("Motor Power", motorTest.getPower());
        telemetry.addData("Status", "Running");
        telemetry.update();

    }
