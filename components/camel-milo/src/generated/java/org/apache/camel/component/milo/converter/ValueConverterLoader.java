/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milo.converter;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class ValueConverterLoader implements TypeConverterLoader {

    public ValueConverterLoader() {
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, org.eclipse.milo.opcua.stack.core.types.builtin.DataValue.class, org.eclipse.milo.opcua.stack.core.types.builtin.Variant.class, false,
            (type, exchange, value) -> org.apache.camel.component.milo.converter.ValueConverter.toDataValue((org.eclipse.milo.opcua.stack.core.types.builtin.Variant) value));
        addTypeConverter(registry, org.eclipse.milo.opcua.stack.core.types.builtin.Variant.class, org.eclipse.milo.opcua.stack.core.types.builtin.DataValue.class, false,
            (type, exchange, value) -> org.apache.camel.component.milo.converter.ValueConverter.toVariant((org.eclipse.milo.opcua.stack.core.types.builtin.DataValue) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
