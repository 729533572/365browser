
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/platform/modules/payments/payment_request.mojom
//

package org.chromium.mojom.payments;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public final class PaymentOptions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];





    public boolean requestPayerEmail;

    public boolean requestPayerPhone;

    public boolean requestShipping;



    private PaymentOptions(int version) {
        super(STRUCT_SIZE, version);







    }

    public PaymentOptions() {
        this(0);
    }

    public static PaymentOptions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    @SuppressWarnings("unchecked")
    public static PaymentOptions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
        PaymentOptions result = new PaymentOptions(mainDataHeader.elementsOrVersion);


        if (mainDataHeader.elementsOrVersion >= 0) {
            
            
            result.requestPayerEmail = decoder0.readBoolean(8, 0);
            
            
        }

        if (mainDataHeader.elementsOrVersion >= 0) {
            
            
            result.requestPayerPhone = decoder0.readBoolean(8, 1);
            
            
        }

        if (mainDataHeader.elementsOrVersion >= 0) {
            
            
            result.requestShipping = decoder0.readBoolean(8, 2);
            
            
        }
















        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {

        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);



        
        
        encoder0.encode(requestPayerEmail, 8, 0);
        

        
        
        encoder0.encode(requestPayerPhone, 8, 1);
        

        
        
        encoder0.encode(requestShipping, 8, 2);
        
















    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;

        PaymentOptions other = (PaymentOptions) object;

        if (this.requestPayerEmail != other.requestPayerEmail)
            return false;

        if (this.requestPayerPhone != other.requestPayerPhone)
            return false;

        if (this.requestShipping != other.requestShipping)
            return false;


        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();

        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(requestPayerEmail);

        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(requestPayerPhone);

        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(requestShipping);

        return result;
    }
}