package com.intellij.idea.plugin.hybris.project.settings;

import com.intellij.idea.plugin.hybris.project.exceptions.HybrisConfigurationException;
import com.intellij.idea.plugin.hybris.utils.HybrisConstants;
import com.intellij.idea.plugin.hybris.utils.LibUtils;
import com.intellij.openapi.roots.ModifiableRootModel;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Collections;
import java.util.Set;

/**
 * Created 3:55 PM 13 June 2015.
 *
 * @author Alexander Bartash <AlexanderBartash@gmail.com>
 */
public class ConfigHybrisModuleDescriptor extends AbstractHybrisModuleDescriptor {

    public ConfigHybrisModuleDescriptor(@NotNull final File moduleRootDirectory,
                                        @NotNull final HybrisProjectDescriptor rootProjectDescriptor
    ) throws HybrisConfigurationException {
        super(moduleRootDirectory, rootProjectDescriptor);
    }

    @NotNull
    @Override
    public String getModuleName() {
        return HybrisConstants.CONFIG_EXTENSION_NAME;
    }

    @NotNull
    @Override
    public Set<String> getRequiredExtensionNames() {
        return Collections.emptySet();
    }

    @Override
    public void loadLibs(@NotNull final ModifiableRootModel modifiableRootModel) {
        final File configLicenceDirectory = new File(
            getModuleRootDirectory(), HybrisConstants.CONFIG_LICENCE_DIRECTORY
        );

        LibUtils.addJarFolderToModuleLibs(modifiableRootModel, configLicenceDirectory, true);
    }
}