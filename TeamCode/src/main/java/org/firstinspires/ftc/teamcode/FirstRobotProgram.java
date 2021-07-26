package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class firstRobotProgram extends LinearOpMode {
    @Override
    // runs on init
    public void runOpMode() throws InterruptedException {

        DcMotorEx motor = hardwareMap.get(DcMotorEx.class, "FrontLeft");

        motor.setPower(0.3);

        // waits for start
        waitForStart();
        // runs on start
        while (opModeIsActive()) {
            motor.setPower(-0.3);
        }
    }
}
}
