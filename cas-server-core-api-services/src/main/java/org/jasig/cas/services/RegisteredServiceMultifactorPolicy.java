package org.jasig.cas.services;

import java.io.Serializable;
import java.util.Set;

/**
 * This is {@link RegisteredServiceMultifactorPolicy} that describes how a service
 * should handle authentication requests.
 *
 * @author Misagh Moayyed
 * @since 4.3.0
 */
public interface RegisteredServiceMultifactorPolicy extends Serializable {

    /**
     * The enum Failure modes.
     */
    enum FailureModes {
        /**
         * Disallow MFA, proceed with authentication but don't communicate MFA to the RP.
         */
        OPEN,
        /**
         * Disallow MFA, block with authentication.
         */
        CLOSED,
        /**
         * Disallow MFA, proceed with authentication and communicate MFA to the RP.
         */
        PHANTOM
    }

    /**
     * Gets MFA authentication provider id.
     *
     * @return the authentication provider id
     */
    Set<String> getMultifactorAuthenticationProviders();


    /**
     * Gets failure mode.
     *
     * @return the failure mode
     */
    FailureModes getFailureMode();

    /**
     * Gets principal attribute name trigger.
     *
     * @return the principal attribute name trigger
     */
    String getPrincipalAttributeNameTrigger();

    /**
     * Gets principal attribute value to match.
     * Values may be regex patterns.
     *
     * @return the principal attribute value to match
     */
    String getPrincipalAttributeValueToMatch();

}
