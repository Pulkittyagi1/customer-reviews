/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6 Sep 2020, 20:04:45                        ---
 * ----------------------------------------------------------------
 */
package org.cyber.feedback.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.cyber.feedback.constants.CyberfeedbackoccConstants;
import org.cyber.feedback.jalo.CustomerFeedbackReview;

/**
 * Generated class for type <code>CyberfeedbackoccManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class CyberfeedbackoccManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n REVIEWS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CustomerFeedbackReview> CUSTOMER2REVIEWRELATIONREVIEWSHANDLER = new OneToManyHandler<CustomerFeedbackReview>(
	CyberfeedbackoccConstants.TC.CUSTOMERFEEDBACKREVIEW,
	true,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CustomerFeedbackReview createCustomerFeedbackReview(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("CustomerFeedbackReview");
			return (CustomerFeedbackReview)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomerFeedbackReview : "+e.getMessage(), 0 );
		}
	}
	
	public CustomerFeedbackReview createCustomerFeedbackReview(final Map attributeValues)
	{
		return createCustomerFeedbackReview( getSession().getSessionContext(), attributeValues );
	}
	
	public static final CyberfeedbackoccManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CyberfeedbackoccManager) em.getExtension(CyberfeedbackoccConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return CyberfeedbackoccConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.reviews</code> attribute.
	 * @return the reviews
	 */
	public Collection<CustomerFeedbackReview> getReviews(final SessionContext ctx, final Customer item)
	{
		return CUSTOMER2REVIEWRELATIONREVIEWSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.reviews</code> attribute.
	 * @return the reviews
	 */
	public Collection<CustomerFeedbackReview> getReviews(final Customer item)
	{
		return getReviews( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.reviews</code> attribute. 
	 * @param value the reviews
	 */
	public void setReviews(final SessionContext ctx, final Customer item, final Collection<CustomerFeedbackReview> value)
	{
		CUSTOMER2REVIEWRELATIONREVIEWSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.reviews</code> attribute. 
	 * @param value the reviews
	 */
	public void setReviews(final Customer item, final Collection<CustomerFeedbackReview> value)
	{
		setReviews( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reviews. 
	 * @param value the item to add to reviews
	 */
	public void addToReviews(final SessionContext ctx, final Customer item, final CustomerFeedbackReview value)
	{
		CUSTOMER2REVIEWRELATIONREVIEWSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reviews. 
	 * @param value the item to add to reviews
	 */
	public void addToReviews(final Customer item, final CustomerFeedbackReview value)
	{
		addToReviews( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reviews. 
	 * @param value the item to remove from reviews
	 */
	public void removeFromReviews(final SessionContext ctx, final Customer item, final CustomerFeedbackReview value)
	{
		CUSTOMER2REVIEWRELATIONREVIEWSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reviews. 
	 * @param value the item to remove from reviews
	 */
	public void removeFromReviews(final Customer item, final CustomerFeedbackReview value)
	{
		removeFromReviews( getSession().getSessionContext(), item, value );
	}
	
}
