/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.types.expressions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.builtins.KotlinBuiltIns;
import org.jetbrains.kotlin.context.GlobalContext;
import org.jetbrains.kotlin.platform.PlatformToKotlinClassMap;
import org.jetbrains.kotlin.resolve.*;
import org.jetbrains.kotlin.resolve.calls.CallExpressionResolver;
import org.jetbrains.kotlin.resolve.calls.CallResolver;
import org.jetbrains.kotlin.resolve.validation.SymbolUsageValidator;
import org.jetbrains.kotlin.types.DynamicTypesSettings;
import org.jetbrains.kotlin.builtins.ReflectionTypes;

import javax.inject.Inject;

public class ExpressionTypingComponents {
    /*package*/ GlobalContext globalContext;
    /*package*/ ExpressionTypingServices expressionTypingServices;
    /*package*/ CallResolver callResolver;
    /*package*/ PlatformToKotlinClassMap platformToKotlinClassMap;
    /*package*/ ControlStructureTypingUtils controlStructureTypingUtils;
    /*package*/ ForLoopConventionsChecker forLoopConventionsChecker;
    /*package*/ ReflectionTypes reflectionTypes;
    /*package*/ AdditionalCheckerProvider additionalCheckerProvider;
    /*package*/ SymbolUsageValidator symbolUsageValidator;
    /*package*/ DynamicTypesSettings dynamicTypesSettings;
    /*package*/ KotlinBuiltIns builtIns;
    /*package*/ LocalClassifierAnalyzer localClassifierAnalyzer;
    /*package*/ FunctionDescriptorResolver functionDescriptorResolver;
    /*package*/ CallExpressionResolver callExpressionResolver;
    /*package*/ DescriptorResolver descriptorResolver;
    /*package*/ TypeResolver typeResolver;
    /*package*/ AnnotationResolver annotationResolver;
    /*package*/ ValueParameterResolver valueParameterResolver;
    /*package*/ MultiDeclarationResolver multiDeclarationResolver;

    @Inject
    public void setGlobalContext(@NotNull GlobalContext globalContext) {
        this.globalContext = globalContext;
    }

    @Inject
    public void setExpressionTypingServices(@NotNull ExpressionTypingServices expressionTypingServices) {
        this.expressionTypingServices = expressionTypingServices;
    }

    @Inject
    public void setCallResolver(@NotNull CallResolver callResolver) {
        this.callResolver = callResolver;
    }

    @Inject
    public void setPlatformToKotlinClassMap(@NotNull PlatformToKotlinClassMap platformToKotlinClassMap) {
        this.platformToKotlinClassMap = platformToKotlinClassMap;
    }

    @Inject
    public void setControlStructureTypingUtils(@NotNull ControlStructureTypingUtils controlStructureTypingUtils) {
        this.controlStructureTypingUtils = controlStructureTypingUtils;
    }

    @Inject
    public void setForLoopConventionsChecker(@NotNull ForLoopConventionsChecker forLoopConventionsChecker) {
        this.forLoopConventionsChecker = forLoopConventionsChecker;
    }

    @Inject
    public void setReflectionTypes(@NotNull ReflectionTypes reflectionTypes) {
        this.reflectionTypes = reflectionTypes;
    }

    @Inject
    public void setAdditionalCheckerProvider(AdditionalCheckerProvider additionalCheckerProvider) {
        this.additionalCheckerProvider = additionalCheckerProvider;
    }

    @Inject
    public void setSymbolUsageValidator(SymbolUsageValidator symbolUsageValidator) {
        this.symbolUsageValidator = symbolUsageValidator;
    }

    @Inject
    public void setDynamicTypesSettings(@NotNull DynamicTypesSettings dynamicTypesSettings) {
        this.dynamicTypesSettings = dynamicTypesSettings;
    }

    @Inject
    public void setBuiltIns(@NotNull KotlinBuiltIns builtIns) {
        this.builtIns = builtIns;
    }

    @Inject
    public void setLocalClassifierAnalyzer(@NotNull LocalClassifierAnalyzer localClassifierAnalyzer) {
        this.localClassifierAnalyzer = localClassifierAnalyzer;
    }

    @Inject
    public void setFunctionDescriptorResolver(FunctionDescriptorResolver functionDescriptorResolver) {
        this.functionDescriptorResolver = functionDescriptorResolver;
    }

    @Inject
    public void setCallExpressionResolver(CallExpressionResolver callExpressionResolver) {
        this.callExpressionResolver = callExpressionResolver;
    }

    @Inject
    public void setDescriptorResolver(DescriptorResolver descriptorResolver) {
        this.descriptorResolver = descriptorResolver;
    }

    @Inject
    public void setTypeResolver(TypeResolver typeResolver) {
        this.typeResolver = typeResolver;
    }

    @Inject
    public void setAnnotationResolver(AnnotationResolver annotationResolver) {
        this.annotationResolver = annotationResolver;
    }

    @Inject
    public void setValueParameterResolver(ValueParameterResolver valueParameterResolver) {
        this.valueParameterResolver = valueParameterResolver;
    }

    @Inject
    public void setMultiDeclarationResolver(MultiDeclarationResolver multiDeclarationResolver) {
        this.multiDeclarationResolver = multiDeclarationResolver;
    }

    @NotNull
    public ForLoopConventionsChecker getForLoopConventionsChecker() {
        return forLoopConventionsChecker;
    }

    @NotNull
    public AdditionalCheckerProvider getAdditionalCheckerProvider() {
        return additionalCheckerProvider;
    }
}
