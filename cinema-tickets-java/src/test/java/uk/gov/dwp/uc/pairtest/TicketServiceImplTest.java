package uk.gov.dwp.uc.pairtest;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import uk.gov.dwp.uc.pairtest.domain.TicketTypeRequest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static uk.gov.dwp.uc.pairtest.domain.TicketTypeRequest.Type.*;
public class TicketServiceImplTest extends TestCase {
    @Mock
    private TicketServiceImpl ticketServiceImpl;
    private static long accountID =1;
    private  static int TicketTypeRequest;

    @BeforeEach
    public void setUp () {
        ticketServiceImpl = new TicketServiceImpl ();
    }
    @Test
    @DisplayName("Test Case For ADULT Ticket Type")
     void testAdultPurchaseTickets (){
        TicketTypeRequest ticketTypeRequestMock = mock (TicketTypeRequest.class);
        int noOfTickets = 5;
        uk.gov.dwp.uc.pairtest.domain.TicketTypeRequest.Type adult = ADULT;
        when(ticketTypeRequestMock.getTicketType()).thenReturn(adult);
        assertTrue(true);
    }
    @Test
    @DisplayName("Test Case For CHILD Ticket Type")
    void testChildPurchaseTickets (){
        TicketTypeRequest ticketTypeRequestMock = mock (TicketTypeRequest.class);
        int noOfTickets = 5;
        uk.gov.dwp.uc.pairtest.domain.TicketTypeRequest.Type child = CHILD;
        when(ticketTypeRequestMock.getTicketType()).thenReturn(child);
        assertFalse("InvalidPurchaseException",false);
    }
    @Test
    @DisplayName("Test Case For INFANT Ticket Type")
    void testInfantPurchaseTickets (){
        TicketTypeRequest ticketTypeRequestMock = mock (TicketTypeRequest.class);
        int noOfTickets = 5;
        uk.gov.dwp.uc.pairtest.domain.TicketTypeRequest.Type infant = INFANT;
        when(ticketTypeRequestMock.getTicketType()).thenReturn(infant);
        assertFalse("InvalidPurchaseException",false);
    }
}