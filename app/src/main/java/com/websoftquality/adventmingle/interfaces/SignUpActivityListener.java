package com.websoftquality.adventmingle.interfaces;
/**
 * @package com.trioangle.igniter
 * @subpackage interfaces
 * @category SignUpActivityListener
 * @author Trioangle Product Team
 * @version 1.0
 **/

import android.content.res.Resources;

import com.websoftquality.adventmingle.views.signup.SignUpActivity;

/*****************************************************************
 SignUpActivityListener
 ****************************************************************/


public interface SignUpActivityListener {

    Resources getRes();

    SignUpActivity getInstance();

}
