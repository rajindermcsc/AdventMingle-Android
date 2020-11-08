package com.websoftquality.adventmingle.interfaces;
/**
 * @package com.trioangle.igniter
 * @subpackage interfaces
 * @category ActivityListener
 * @author Trioangle Product Team
 * @version 1.0
 **/

import android.content.res.Resources;

import com.websoftquality.adventmingle.views.main.HomeActivity;

/*****************************************************************
 ActivityListener
 ****************************************************************/

public interface ActivityListener {

    Resources getRes();

    HomeActivity getInstance();

}
