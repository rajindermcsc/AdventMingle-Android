package com.websoftquality.adventmingle.interfaces;

/**
 * @package com.trioangle.igniter
 * @subpackage interfaces
 * @category ServiceListener
 * @author Trioangle Product Team
 * @version 1.0
 **/

import com.websoftquality.adventmingle.datamodels.main.JsonResponse;

/*****************************************************************
 ServiceListener
 ****************************************************************/
public interface ServiceListener {

    void onSuccess(JsonResponse jsonResp, String data);

    void onFailure(JsonResponse jsonResp, String data);
}
