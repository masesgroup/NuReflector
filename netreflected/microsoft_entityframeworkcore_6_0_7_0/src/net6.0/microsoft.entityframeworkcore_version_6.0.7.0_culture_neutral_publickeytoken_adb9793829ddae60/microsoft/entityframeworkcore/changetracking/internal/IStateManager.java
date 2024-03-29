/*
 *  MIT License
 *
 *  Copyright (c) 2022 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package microsoft.entityframeworkcore.changetracking.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.entityframeworkcore.infrastructure.IResettableService;
import microsoft.entityframeworkcore.infrastructure.IResettableServiceImplementation;
import microsoft.entityframeworkcore.changetracking.internal.InternalEntityEntry;
import microsoft.entityframeworkcore.metadata.IForeignKey;
import microsoft.entityframeworkcore.metadata.IForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IEntityType;
import microsoft.entityframeworkcore.metadata.IEntityTypeImplementation;
import microsoft.entityframeworkcore.storage.ValueBuffer;
import microsoft.entityframeworkcore.metadata.IKey;
import microsoft.entityframeworkcore.metadata.IKeyImplementation;
import microsoft.entityframeworkcore.internal.IEntityFinder;
import microsoft.entityframeworkcore.internal.IEntityFinderImplementation;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import microsoft.entityframeworkcore.EntityState;
import microsoft.entityframeworkcore.metadata.INavigationBase;
import microsoft.entityframeworkcore.metadata.INavigationBaseImplementation;
import microsoft.entityframeworkcore.changetracking.CascadeTiming;
import microsoft.entityframeworkcore.changetracking.internal.IInternalEntityEntryNotifier;
import microsoft.entityframeworkcore.changetracking.internal.IInternalEntityEntryNotifierImplementation;
import microsoft.entityframeworkcore.changetracking.internal.IValueGenerationManager;
import microsoft.entityframeworkcore.changetracking.internal.IValueGenerationManagerImplementation;
import microsoft.entityframeworkcore.changetracking.internal.StateManagerDependencies;
import microsoft.entityframeworkcore.DbContext;
import microsoft.entityframeworkcore.metadata.IModel;
import microsoft.entityframeworkcore.metadata.IModelImplementation;
import microsoft.entityframeworkcore.query.IEntityMaterializerSource;
import microsoft.entityframeworkcore.query.IEntityMaterializerSourceImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IStateManager, Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IStateManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IStateManager</a>
 */
public interface IStateManager extends IJCOBridgeReflected, IResettableService {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IStateManager
     */
    public static final String className = "Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IStateManager";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IStateManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IStateManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IStateManager ToIStateManager(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IStateManagerImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public int GetCountForState(boolean added, boolean modified, boolean deleted, boolean unchanged, boolean returnSharedIdentity) throws Throwable;

    public int SaveChanges(boolean acceptAllChangesOnSuccess) throws Throwable;

    public InternalEntityEntry FindPrincipal(InternalEntityEntry dependentEntry, IForeignKey foreignKey) throws Throwable;

    public InternalEntityEntry FindPrincipalUsingPreStoreGeneratedValues(InternalEntityEntry dependentEntry, IForeignKey foreignKey) throws Throwable;

    public InternalEntityEntry FindPrincipalUsingRelationshipSnapshot(InternalEntityEntry dependentEntry, IForeignKey foreignKey) throws Throwable;

    public InternalEntityEntry GetOrCreateEntry(NetObject entity, IEntityType entityType) throws Throwable;

    public InternalEntityEntry GetOrCreateEntry(NetObject entity) throws Throwable;

    public InternalEntityEntry StartTracking(InternalEntityEntry entry) throws Throwable;

    public InternalEntityEntry StartTrackingFromQuery(IEntityType baseEntityType, NetObject entity, JCORefOut<ValueBuffer> valueBuffer) throws Throwable;

    public InternalEntityEntry TryGetEntry(IKey key, NetObject[] keyValues, boolean throwOnNullKey, JCORefOut<java.util.concurrent.atomic.AtomicBoolean> hasNullKey) throws Throwable;

    public InternalEntityEntry TryGetEntry(IKey key, NetObject[] keyValues) throws Throwable;

    public InternalEntityEntry TryGetEntry(NetObject entity, boolean throwOnNonUniqueness) throws Throwable;

    public InternalEntityEntry TryGetEntry(NetObject entity, IEntityType type, boolean throwOnTypeMismatch) throws Throwable;

    public IEntityFinder CreateEntityFinder(IEntityType entityType) throws Throwable;


    public void AbortAttachGraph() throws Throwable;

    public void AcceptAllChanges() throws Throwable;

    public void BeginAttachGraph() throws Throwable;

    public void CascadeChanges(boolean force) throws Throwable;

    public void Clear() throws Throwable;

    public void CompleteAttachGraph() throws Throwable;

    public void OnStateChanged(InternalEntityEntry internalEntityEntry, EntityState oldState) throws Throwable;

    public void OnTracked(InternalEntityEntry internalEntityEntry, boolean fromQuery) throws Throwable;

    public void RecordReferencedUntrackedEntity(NetObject referencedEntity, INavigationBase navigation, InternalEntityEntry referencedFromEntry) throws Throwable;


    public void StateChanging(InternalEntityEntry entry, EntityState newState) throws Throwable;

    public void StopTracking(InternalEntityEntry entry, EntityState oldState) throws Throwable;

    public void Unsubscribe() throws Throwable;

    public void UpdateDependentMap(InternalEntityEntry entry, IForeignKey foreignKey) throws Throwable;

    public void UpdateIdentityMap(InternalEntityEntry entry, IKey principalKey) throws Throwable;


    
    // Properties section
    
    public boolean getSavingChanges() throws Throwable;

    public boolean getSensitiveLoggingEnabled() throws Throwable;

    public int getChangedCount() throws Throwable;

    public void setChangedCount(int ChangedCount) throws Throwable;

    public int getCount() throws Throwable;

    public CascadeTiming getCascadeDeleteTiming() throws Throwable;

    public void setCascadeDeleteTiming(CascadeTiming CascadeDeleteTiming) throws Throwable;

    public CascadeTiming getDeleteOrphansTiming() throws Throwable;

    public void setDeleteOrphansTiming(CascadeTiming DeleteOrphansTiming) throws Throwable;

    public IInternalEntityEntryNotifier getInternalEntityEntryNotifier() throws Throwable;

    public IValueGenerationManager getValueGenerationManager() throws Throwable;

    public StateManagerDependencies getDependencies() throws Throwable;

    public DbContext getContext() throws Throwable;

    public IModel getModel() throws Throwable;

    public IEntityMaterializerSource getEntityMaterializerSource() throws Throwable;



    // Instance Events section
    

}