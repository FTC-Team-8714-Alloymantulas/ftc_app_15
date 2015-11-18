package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


public class Controller extends OpMode {
    DcMotor Lmotor;
    DcMotor Rmotor;
    servo bumper1;
    servo bumper2;
}
    
    @Override
    public void init() {
        Lmotor = hardwareMap.dcMotor.get("left_drive");
        Rmotor = hardwareMap.dcMotor.get("right_drive");

        Rmotor.setDirection(DcMotor.Direction.REVERSE);
        Lmotor.setDirection(DcMotor.Direction.REVERSE);

        Bumper1 = hardwareMap.servo.get("bumper")
        Bumper2 = haedwaremap.servo.get("bumper")


    }


    @Override
    public void loop() {
        float leftY= -gamepad1.left_stick_y;
        float rightY= -gamepad1.right_stick_y;
        float bumpy= -gamepad.button_4;
        float bumpy2= -gamepad.button_3;

        Lmotor.setPower(leftY);
        Rmotor.setPower(rightY);
        bumper1.setPower(bumpy);
        bumper2.setPower(bumpy);
        bumper1.setPower(bumpy2);
        bumper2.setPower(bumpy2);

    }
}