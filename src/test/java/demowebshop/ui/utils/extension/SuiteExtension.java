package demowebshop.ui.utils.extension;


import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store.CloseableResource;

/**
 * <h3>Интерфейс extension JUnit5 с методами, которые будут запускать по одному разу перед и после
 * всех тестов</h3>
 */
public interface SuiteExtension extends BeforeAllCallback {
    default void beforeSuite(){

    }
    default void afterSuite(){

    }

    @Override
    default void beforeAll(ExtensionContext context) throws Exception {
        context.getRoot().getStore(Namespace.GLOBAL)
                .getOrComputeIfAbsent(
                        SuiteExtension.class,
                        suiteExtensionClass -> {
                            beforeSuite();
                            return (CloseableResource) this::afterSuite;
                        }
                );
    }
}
