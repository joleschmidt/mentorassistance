package de.thm.mni.oopfq.util;

import io.vertx.core.json.JsonObject;

/**
 * Enables an object to translate itselt into an json object.
 */
public interface IJsyfieable {

    /**
     * @return Json representation of an object.
     */
    JsonObject toJson();
}
