/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6 Sep 2020, 20:04:45                        ---
 * ----------------------------------------------------------------
 */
package org.cyber.feedback.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.cyber.feedback.constants.CyberfeedbackoccConstants;

/**
 * Generated class for type CustomerFeedbackReview.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class CustomerFeedbackReview extends GenericItem
{
	/** Qualifier of the <code>CustomerFeedbackReview.body</code> attribute **/
	public static final String BODY = "body";
	/** Qualifier of the <code>CustomerFeedbackReview.subject</code> attribute **/
	public static final String SUBJECT = "subject";
	/** Qualifier of the <code>CustomerFeedbackReview.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CUSTOMER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<CustomerFeedbackReview> CUSTOMERHANDLER = new BidirectionalOneToManyHandler<CustomerFeedbackReview>(
	CyberfeedbackoccConstants.TC.CUSTOMERFEEDBACKREVIEW,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BODY, AttributeMode.INITIAL);
		tmp.put(SUBJECT, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedbackReview.body</code> attribute.
	 * @return the body - review body
	 */
	public String getBody(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "body".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedbackReview.body</code> attribute.
	 * @return the body - review body
	 */
	public String getBody()
	{
		return getBody( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedbackReview.body</code> attribute. 
	 * @param value the body - review body
	 */
	public void setBody(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "body".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedbackReview.body</code> attribute. 
	 * @param value the body - review body
	 */
	public void setBody(final String value)
	{
		setBody( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CUSTOMERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedbackReview.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, "customer".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedbackReview.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedbackReview.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		CUSTOMERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedbackReview.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedbackReview.subject</code> attribute.
	 * @return the subject - review subject
	 */
	public String getSubject(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "subject".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedbackReview.subject</code> attribute.
	 * @return the subject - review subject
	 */
	public String getSubject()
	{
		return getSubject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedbackReview.subject</code> attribute. 
	 * @param value the subject - review subject
	 */
	public void setSubject(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "subject".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedbackReview.subject</code> attribute. 
	 * @param value the subject - review subject
	 */
	public void setSubject(final String value)
	{
		setSubject( getSession().getSessionContext(), value );
	}
	
}
